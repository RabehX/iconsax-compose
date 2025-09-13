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


val Iconsax.Filled.FolderAdd: ImageVector
    get() {
        if (_FolderAdd != null) {
            return _FolderAdd!!
        }
        _FolderAdd = ImageVector.Builder(
            name = "Filled.FolderAdd",
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
                lineTo(3f, 10.75f)
                curveTo(2.448f, 10.75f, 2f, 11.198f, 2f, 11.75f)
                verticalLineTo(16.65f)
                curveTo(2f, 19.6f, 4.4f, 22f, 7.35f, 22f)
                horizontalLineTo(16.65f)
                curveTo(19.6f, 22f, 22f, 19.6f, 22f, 16.65f)
                lineTo(21.983f, 11.747f)
                close()
                moveTo(14.5f, 16.75f)
                horizontalLineTo(12.81f)
                verticalLineTo(18.5f)
                curveTo(12.81f, 18.91f, 12.47f, 19.25f, 12.06f, 19.25f)
                curveTo(11.64f, 19.25f, 11.31f, 18.91f, 11.31f, 18.5f)
                verticalLineTo(16.75f)
                horizontalLineTo(9.5f)
                curveTo(9.09f, 16.75f, 8.75f, 16.41f, 8.75f, 16f)
                curveTo(8.75f, 15.59f, 9.09f, 15.25f, 9.5f, 15.25f)
                horizontalLineTo(11.31f)
                verticalLineTo(13.5f)
                curveTo(11.31f, 13.09f, 11.64f, 12.75f, 12.06f, 12.75f)
                curveTo(12.47f, 12.75f, 12.81f, 13.09f, 12.81f, 13.5f)
                verticalLineTo(15.25f)
                horizontalLineTo(14.5f)
                curveTo(14.91f, 15.25f, 15.25f, 15.59f, 15.25f, 16f)
                curveTo(15.25f, 16.41f, 14.91f, 16.75f, 14.5f, 16.75f)
                close()
            }
        }.build()

        return _FolderAdd!!
    }

@Suppress("ObjectPropertyName")
private var _FolderAdd: ImageVector? = null
