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


val Iconsax.Filled.VideoPlay: ImageVector
    get() {
        if (_VideoPlay != null) {
            return _VideoPlay!!
        }
        _VideoPlay = ImageVector.Builder(
            name = "Filled.VideoPlay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.729f, 2f)
                horizontalLineTo(9.27f)
                verticalLineTo(6.36f)
                horizontalLineTo(14.729f)
                verticalLineTo(2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.23f, 2f)
                verticalLineTo(6.36f)
                horizontalLineTo(21.871f)
                curveTo(21.361f, 3.61f, 19.33f, 2.01f, 16.23f, 2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2f, 7.859f)
                verticalLineTo(16.189f)
                curveTo(2f, 19.829f, 4.17f, 21.999f, 7.81f, 21.999f)
                horizontalLineTo(16.19f)
                curveTo(19.83f, 21.999f, 22f, 19.829f, 22f, 16.189f)
                verticalLineTo(7.859f)
                horizontalLineTo(2f)
                close()
                moveTo(14.44f, 16.179f)
                lineTo(12.36f, 17.379f)
                curveTo(11.92f, 17.629f, 11.49f, 17.759f, 11.09f, 17.759f)
                curveTo(10.79f, 17.759f, 10.52f, 17.689f, 10.27f, 17.549f)
                curveTo(9.69f, 17.219f, 9.37f, 16.539f, 9.37f, 15.659f)
                verticalLineTo(13.259f)
                curveTo(9.37f, 12.379f, 9.69f, 11.699f, 10.27f, 11.369f)
                curveTo(10.85f, 11.029f, 11.59f, 11.089f, 12.36f, 11.539f)
                lineTo(14.44f, 12.739f)
                curveTo(15.21f, 13.179f, 15.63f, 13.799f, 15.63f, 14.469f)
                curveTo(15.63f, 15.139f, 15.2f, 15.729f, 14.44f, 16.179f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.769f, 2f)
                curveTo(4.669f, 2.01f, 2.639f, 3.61f, 2.129f, 6.36f)
                horizontalLineTo(7.769f)
                verticalLineTo(2f)
                close()
            }
        }.build()

        return _VideoPlay!!
    }

@Suppress("ObjectPropertyName")
private var _VideoPlay: ImageVector? = null
