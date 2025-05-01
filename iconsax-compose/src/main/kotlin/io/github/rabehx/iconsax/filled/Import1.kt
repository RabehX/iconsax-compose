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


val Iconsax.Filled.Import1: ImageVector
    get() {
        if (_Import1 != null) {
            return _Import1!!
        }
        _Import1 = ImageVector.Builder(
            name = "Filled.Import1",
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
                moveTo(17.53f, 7.53f)
                lineTo(9.81f, 15.25f)
                horizontalLineTo(12.83f)
                curveTo(13.24f, 15.25f, 13.58f, 15.59f, 13.58f, 16f)
                curveTo(13.58f, 16.41f, 13.24f, 16.75f, 12.83f, 16.75f)
                horizontalLineTo(8f)
                curveTo(7.59f, 16.75f, 7.25f, 16.41f, 7.25f, 16f)
                verticalLineTo(11.17f)
                curveTo(7.25f, 10.76f, 7.59f, 10.42f, 8f, 10.42f)
                curveTo(8.41f, 10.42f, 8.75f, 10.76f, 8.75f, 11.17f)
                verticalLineTo(14.19f)
                lineTo(16.47f, 6.47f)
                curveTo(16.62f, 6.32f, 16.81f, 6.25f, 17f, 6.25f)
                curveTo(17.19f, 6.25f, 17.38f, 6.32f, 17.53f, 6.47f)
                curveTo(17.82f, 6.76f, 17.82f, 7.24f, 17.53f, 7.53f)
                close()
            }
        }.build()

        return _Import1!!
    }

@Suppress("ObjectPropertyName")
private var _Import1: ImageVector? = null
