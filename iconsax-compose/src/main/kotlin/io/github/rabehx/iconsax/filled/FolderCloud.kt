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


val Iconsax.Filled.FolderCloud: ImageVector
    get() {
        if (_FolderCloud != null) {
            return _FolderCloud!!
        }
        _FolderCloud = ImageVector.Builder(
            name = "Filled.FolderCloud",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.579f, 19.699f)
                curveTo(13.469f, 19.849f, 13.469f, 22.909f, 15.579f, 23.059f)
                horizontalLineTo(20.589f)
                curveTo(21.199f, 23.059f, 21.779f, 22.839f, 22.229f, 22.429f)
                curveTo(23.709f, 21.139f, 22.919f, 18.539f, 20.969f, 18.299f)
                curveTo(20.269f, 14.079f, 14.159f, 15.679f, 15.609f, 19.699f)
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.579f, 19.699f)
                curveTo(13.469f, 19.849f, 13.469f, 22.909f, 15.579f, 23.059f)
                horizontalLineTo(20.589f)
                curveTo(21.199f, 23.059f, 21.779f, 22.839f, 22.229f, 22.429f)
                curveTo(23.709f, 21.139f, 22.919f, 18.539f, 20.969f, 18.299f)
                curveTo(20.269f, 14.079f, 14.159f, 15.679f, 15.609f, 19.699f)
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 11.07f)
                verticalLineTo(15.34f)
                curveTo(22f, 15.66f, 21.49f, 15.8f, 21.27f, 15.57f)
                curveTo(20.8f, 15.08f, 20.21f, 14.71f, 19.53f, 14.5f)
                curveTo(17.96f, 14.01f, 16.15f, 14.49f, 15.01f, 15.67f)
                curveTo(14.29f, 16.44f, 13.9f, 17.4f, 13.88f, 18.44f)
                curveTo(13.88f, 18.62f, 13.79f, 18.78f, 13.65f, 18.89f)
                curveTo(12.93f, 19.46f, 12.49f, 20.35f, 12.49f, 21.37f)
                verticalLineTo(21.38f)
                curveTo(12.49f, 21.7f, 12.26f, 21.99f, 11.94f, 21.99f)
                horizontalLineTo(7.34f)
                curveTo(4.4f, 22f, 2f, 19.6f, 2f, 16.65f)
                verticalLineTo(6.42f)
                curveTo(2f, 3.98f, 3.98f, 2f, 6.42f, 2f)
                horizontalLineTo(8.74f)
                curveTo(10.37f, 2f, 10.88f, 2.53f, 11.53f, 3.4f)
                lineTo(12.93f, 5.26f)
                curveTo(13.24f, 5.67f, 13.28f, 5.72f, 13.86f, 5.72f)
                horizontalLineTo(16.65f)
                curveTo(19.03f, 5.72f, 21.05f, 7.28f, 21.74f, 9.44f)
                curveTo(21.89f, 9.89f, 21.97f, 10.35f, 21.99f, 10.84f)
                curveTo(22f, 10.91f, 22f, 11f, 22f, 11.07f)
                close()
            }
        }.build()

        return _FolderCloud!!
    }

@Suppress("ObjectPropertyName")
private var _FolderCloud: ImageVector? = null
