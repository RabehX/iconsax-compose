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


val Iconsax.Filled.PictureFrame: ImageVector
    get() {
        if (_PictureFrame != null) {
            return _PictureFrame!!
        }
        _PictureFrame = ImageVector.Builder(
            name = "Filled.PictureFrame",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.51f, 11.22f)
                lineTo(8.31f, 2.39f)
                curveTo(8.26f, 2.16f, 8.05f, 2f, 7.81f, 2f)
                curveTo(4.6f, 2f, 2f, 4.6f, 2f, 7.81f)
                verticalLineTo(13.51f)
                curveTo(2f, 13.85f, 2.33f, 14.1f, 2.66f, 14f)
                lineTo(10.16f, 11.83f)
                curveTo(10.42f, 11.76f, 10.58f, 11.49f, 10.51f, 11.22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.12f, 13.679f)
                curveTo(11.05f, 13.399f, 10.76f, 13.229f, 10.48f, 13.309f)
                lineTo(2.37f, 15.669f)
                curveTo(2.15f, 15.739f, 2f, 15.939f, 2f, 16.169f)
                verticalLineTo(16.189f)
                curveTo(2f, 19.399f, 4.6f, 21.999f, 7.81f, 21.999f)
                horizontalLineTo(12.53f)
                curveTo(12.86f, 21.999f, 13.11f, 21.689f, 13.03f, 21.359f)
                lineTo(11.12f, 13.679f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.191f, 2f)
                horizontalLineTo(10.441f)
                curveTo(10.111f, 2f, 9.861f, 2.31f, 9.941f, 2.64f)
                lineTo(14.681f, 21.61f)
                curveTo(14.741f, 21.84f, 14.941f, 22f, 15.181f, 22f)
                horizontalLineTo(16.181f)
                curveTo(19.401f, 22f, 22.001f, 19.4f, 22.001f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22.001f, 4.6f, 19.401f, 2f, 16.191f, 2f)
                close()
            }
        }.build()

        return _PictureFrame!!
    }

@Suppress("ObjectPropertyName")
private var _PictureFrame: ImageVector? = null
