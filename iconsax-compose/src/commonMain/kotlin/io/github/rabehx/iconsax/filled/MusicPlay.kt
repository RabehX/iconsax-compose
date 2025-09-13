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


val Iconsax.Filled.MusicPlay: ImageVector
    get() {
        if (_MusicPlay != null) {
            return _MusicPlay!!
        }
        _MusicPlay = ImageVector.Builder(
            name = "Filled.MusicPlay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.181f, 11.861f)
                curveTo(12.781f, 11.861f, 12.421f, 11.641f, 12.251f, 11.281f)
                lineTo(10.801f, 8.391f)
                lineTo(10.381f, 9.171f)
                curveTo(10.151f, 9.601f, 9.691f, 9.871f, 9.201f, 9.871f)
                horizontalLineTo(8.471f)
                curveTo(8.061f, 9.871f, 7.721f, 9.531f, 7.721f, 9.121f)
                curveTo(7.721f, 8.711f, 8.061f, 8.371f, 8.471f, 8.371f)
                horizontalLineTo(9.111f)
                lineTo(9.901f, 6.911f)
                curveTo(10.091f, 6.571f, 10.471f, 6.341f, 10.831f, 6.361f)
                curveTo(11.221f, 6.361f, 11.571f, 6.591f, 11.751f, 6.931f)
                lineTo(13.181f, 9.791f)
                lineTo(13.521f, 9.101f)
                curveTo(13.751f, 8.641f, 14.201f, 8.361f, 14.721f, 8.361f)
                horizontalLineTo(15.531f)
                curveTo(15.941f, 8.361f, 16.281f, 8.701f, 16.281f, 9.111f)
                curveTo(16.281f, 9.521f, 15.941f, 9.861f, 15.531f, 9.861f)
                horizontalLineTo(14.821f)
                lineTo(14.111f, 11.271f)
                curveTo(13.931f, 11.641f, 13.581f, 11.861f, 13.181f, 11.861f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2.75f, 18.651f)
                curveTo(2.34f, 18.651f, 2f, 18.311f, 2f, 17.901f)
                verticalLineTo(12.201f)
                curveTo(1.95f, 9.491f, 2.96f, 6.931f, 4.84f, 5.011f)
                curveTo(6.72f, 3.101f, 9.24f, 2.051f, 11.95f, 2.051f)
                curveTo(17.49f, 2.051f, 22f, 6.561f, 22f, 12.101f)
                verticalLineTo(17.801f)
                curveTo(22f, 18.211f, 21.66f, 18.551f, 21.25f, 18.551f)
                curveTo(20.84f, 18.551f, 20.5f, 18.211f, 20.5f, 17.801f)
                verticalLineTo(12.101f)
                curveTo(20.5f, 7.391f, 16.67f, 3.551f, 11.95f, 3.551f)
                curveTo(9.64f, 3.551f, 7.5f, 4.441f, 5.91f, 6.061f)
                curveTo(4.31f, 7.691f, 3.46f, 9.861f, 3.5f, 12.181f)
                verticalLineTo(17.891f)
                curveTo(3.5f, 18.311f, 3.17f, 18.651f, 2.75f, 18.651f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.94f, 12.449f)
                horizontalLineTo(5.81f)
                curveTo(3.71f, 12.449f, 2f, 14.159f, 2f, 16.259f)
                verticalLineTo(18.139f)
                curveTo(2f, 20.239f, 3.71f, 21.949f, 5.81f, 21.949f)
                horizontalLineTo(5.94f)
                curveTo(8.04f, 21.949f, 9.75f, 20.239f, 9.75f, 18.139f)
                verticalLineTo(16.259f)
                curveTo(9.75f, 14.159f, 8.04f, 12.449f, 5.94f, 12.449f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.19f, 12.449f)
                horizontalLineTo(18.06f)
                curveTo(15.96f, 12.449f, 14.25f, 14.159f, 14.25f, 16.259f)
                verticalLineTo(18.139f)
                curveTo(14.25f, 20.239f, 15.96f, 21.949f, 18.06f, 21.949f)
                horizontalLineTo(18.19f)
                curveTo(20.29f, 21.949f, 22f, 20.239f, 22f, 18.139f)
                verticalLineTo(16.259f)
                curveTo(22f, 14.159f, 20.29f, 12.449f, 18.19f, 12.449f)
                close()
            }
        }.build()

        return _MusicPlay!!
    }

@Suppress("ObjectPropertyName")
private var _MusicPlay: ImageVector? = null
