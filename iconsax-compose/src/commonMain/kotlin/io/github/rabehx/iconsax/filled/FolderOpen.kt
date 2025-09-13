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


val Iconsax.Filled.FolderOpen: ImageVector
    get() {
        if (_FolderOpen != null) {
            return _FolderOpen!!
        }
        _FolderOpen = ImageVector.Builder(
            name = "Filled.FolderOpen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.058f, 11.822f)
                lineTo(20.898f, 11.602f)
                curveTo(20.618f, 11.262f, 20.288f, 10.992f, 19.908f, 10.792f)
                curveTo(19.398f, 10.502f, 18.818f, 10.352f, 18.218f, 10.352f)
                horizontalLineTo(5.768f)
                curveTo(5.168f, 10.352f, 4.598f, 10.502f, 4.078f, 10.792f)
                curveTo(3.688f, 11.002f, 3.338f, 11.292f, 3.048f, 11.652f)
                curveTo(2.478f, 12.382f, 2.208f, 13.282f, 2.298f, 14.182f)
                lineTo(2.668f, 18.852f)
                curveTo(2.798f, 20.262f, 2.968f, 22.002f, 6.138f, 22.002f)
                horizontalLineTo(17.858f)
                curveTo(21.028f, 22.002f, 21.188f, 20.262f, 21.328f, 18.842f)
                lineTo(21.698f, 14.192f)
                curveTo(21.788f, 13.352f, 21.568f, 12.512f, 21.058f, 11.822f)
                close()
                moveTo(14.388f, 17.342f)
                horizontalLineTo(9.598f)
                curveTo(9.208f, 17.342f, 8.898f, 17.022f, 8.898f, 16.642f)
                curveTo(8.898f, 16.262f, 9.208f, 15.942f, 9.598f, 15.942f)
                horizontalLineTo(14.388f)
                curveTo(14.778f, 15.942f, 15.088f, 16.262f, 15.088f, 16.642f)
                curveTo(15.088f, 17.032f, 14.778f, 17.342f, 14.388f, 17.342f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.56f, 8.596f)
                curveTo(20.598f, 8.979f, 20.182f, 9.236f, 19.817f, 9.113f)
                curveTo(19.313f, 8.944f, 18.781f, 8.86f, 18.229f, 8.86f)
                horizontalLineTo(5.769f)
                curveTo(5.212f, 8.86f, 4.664f, 8.95f, 4.152f, 9.122f)
                curveTo(3.792f, 9.243f, 3.379f, 8.995f, 3.379f, 8.615f)
                verticalLineTo(6.66f)
                curveTo(3.379f, 3.09f, 4.469f, 2f, 8.039f, 2f)
                horizontalLineTo(9.219f)
                curveTo(10.649f, 2f, 11.099f, 2.46f, 11.679f, 3.21f)
                lineTo(12.879f, 4.81f)
                curveTo(13.129f, 5.15f, 13.139f, 5.17f, 13.579f, 5.17f)
                horizontalLineTo(15.959f)
                curveTo(19.085f, 5.17f, 20.306f, 6.007f, 20.56f, 8.596f)
                close()
            }
        }.build()

        return _FolderOpen!!
    }

@Suppress("ObjectPropertyName")
private var _FolderOpen: ImageVector? = null
