/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.CloseSquare: ImageVector
    get() {
        if (_CloseSquare != null) {
            return _CloseSquare!!
        }
        _CloseSquare = ImageVector.Builder(
            name = "Filled.CloseSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(15.36f, 14.3f)
                curveTo(15.65f, 14.59f, 15.65f, 15.07f, 15.36f, 15.36f)
                curveTo(15.21f, 15.51f, 15.02f, 15.58f, 14.83f, 15.58f)
                curveTo(14.64f, 15.58f, 14.45f, 15.51f, 14.3f, 15.36f)
                lineTo(12f, 13.06f)
                lineTo(9.7f, 15.36f)
                curveTo(9.55f, 15.51f, 9.36f, 15.58f, 9.17f, 15.58f)
                curveTo(8.98f, 15.58f, 8.79f, 15.51f, 8.64f, 15.36f)
                curveTo(8.35f, 15.07f, 8.35f, 14.59f, 8.64f, 14.3f)
                lineTo(10.94f, 12f)
                lineTo(8.64f, 9.7f)
                curveTo(8.35f, 9.41f, 8.35f, 8.93f, 8.64f, 8.64f)
                curveTo(8.93f, 8.35f, 9.41f, 8.35f, 9.7f, 8.64f)
                lineTo(12f, 10.94f)
                lineTo(14.3f, 8.64f)
                curveTo(14.59f, 8.35f, 15.07f, 8.35f, 15.36f, 8.64f)
                curveTo(15.65f, 8.93f, 15.65f, 9.41f, 15.36f, 9.7f)
                lineTo(13.06f, 12f)
                lineTo(15.36f, 14.3f)
                close()
            }
        }.build()

        return _CloseSquare!!
    }

@Suppress("ObjectPropertyName")
private var _CloseSquare: ImageVector? = null
