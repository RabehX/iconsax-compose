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


val Iconsax.Filled.FolderMinus: ImageVector
    get() {
        if (_FolderMinus != null) {
            return _FolderMinus!!
        }
        _FolderMinus = ImageVector.Builder(
            name = "Filled.FolderMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.017f, 7.992f)
                curveTo(21.415f, 8.558f, 20.941f, 9.25f, 20.248f, 9.25f)
                horizontalLineTo(3f)
                curveTo(2.448f, 9.25f, 2f, 8.802f, 2f, 8.25f)
                verticalLineTo(6.42f)
                curveTo(2f, 3.98f, 3.98f, 2f, 6.42f, 2f)
                horizontalLineTo(8.74f)
                curveTo(10.37f, 2f, 10.88f, 2.53f, 11.53f, 3.4f)
                lineTo(12.93f, 5.26f)
                curveTo(13.24f, 5.67f, 13.28f, 5.72f, 13.86f, 5.72f)
                horizontalLineTo(16.65f)
                curveTo(18.455f, 5.72f, 20.052f, 6.617f, 21.017f, 7.992f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.983f, 11.747f)
                curveTo(21.982f, 11.196f, 21.534f, 10.75f, 20.983f, 10.75f)
                lineTo(3f, 10.751f)
                curveTo(2.448f, 10.751f, 2f, 11.198f, 2f, 11.751f)
                verticalLineTo(16.651f)
                curveTo(2f, 19.601f, 4.4f, 22.001f, 7.35f, 22.001f)
                horizontalLineTo(16.65f)
                curveTo(19.6f, 22.001f, 22f, 19.601f, 22f, 16.651f)
                lineTo(21.983f, 11.747f)
                close()
                moveTo(14.43f, 16.751f)
                horizontalLineTo(9.43f)
                curveTo(9.01f, 16.751f, 8.68f, 16.421f, 8.68f, 16.001f)
                curveTo(8.68f, 15.591f, 9.01f, 15.251f, 9.43f, 15.251f)
                horizontalLineTo(14.43f)
                curveTo(14.84f, 15.251f, 15.18f, 15.591f, 15.18f, 16.001f)
                curveTo(15.18f, 16.421f, 14.84f, 16.751f, 14.43f, 16.751f)
                close()
            }
        }.build()

        return _FolderMinus!!
    }

@Suppress("ObjectPropertyName")
private var _FolderMinus: ImageVector? = null
