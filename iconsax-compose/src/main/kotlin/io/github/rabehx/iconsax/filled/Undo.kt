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


val Iconsax.Filled.Undo: ImageVector
    get() {
        if (_Undo != null) {
            return _Undo!!
        }
        _Undo = ImageVector.Builder(
            name = "Filled.Undo",
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
                moveTo(13.92f, 16.63f)
                horizontalLineTo(9f)
                curveTo(8.59f, 16.63f, 8.25f, 16.29f, 8.25f, 15.88f)
                curveTo(8.25f, 15.47f, 8.59f, 15.13f, 9f, 15.13f)
                horizontalLineTo(13.92f)
                curveTo(15.2f, 15.13f, 16.25f, 14.09f, 16.25f, 12.8f)
                curveTo(16.25f, 11.51f, 15.21f, 10.47f, 13.92f, 10.47f)
                horizontalLineTo(8.85f)
                lineTo(9.11f, 10.73f)
                curveTo(9.4f, 11.02f, 9.4f, 11.5f, 9.11f, 11.79f)
                curveTo(8.96f, 11.94f, 8.77f, 12.01f, 8.58f, 12.01f)
                curveTo(8.39f, 12.01f, 8.2f, 11.94f, 8.05f, 11.79f)
                lineTo(6.48f, 10.22f)
                curveTo(6.19f, 9.93f, 6.19f, 9.45f, 6.48f, 9.16f)
                lineTo(8.05f, 7.59f)
                curveTo(8.34f, 7.3f, 8.82f, 7.3f, 9.11f, 7.59f)
                curveTo(9.4f, 7.88f, 9.4f, 8.36f, 9.11f, 8.65f)
                lineTo(8.77f, 8.98f)
                horizontalLineTo(13.92f)
                curveTo(16.03f, 8.98f, 17.75f, 10.7f, 17.75f, 12.81f)
                curveTo(17.75f, 14.92f, 16.03f, 16.63f, 13.92f, 16.63f)
                close()
            }
        }.build()

        return _Undo!!
    }

@Suppress("ObjectPropertyName")
private var _Undo: ImageVector? = null
