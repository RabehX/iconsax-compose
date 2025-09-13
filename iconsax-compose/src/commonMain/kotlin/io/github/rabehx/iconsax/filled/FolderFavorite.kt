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


val Iconsax.Filled.FolderFavorite: ImageVector
    get() {
        if (_FolderFavorite != null) {
            return _FolderFavorite!!
        }
        _FolderFavorite = ImageVector.Builder(
            name = "Filled.FolderFavorite",
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
                moveTo(14.54f, 16.97f)
                lineTo(12.39f, 18.85f)
                curveTo(12.28f, 18.95f, 12.14f, 19f, 12f, 19f)
                curveTo(11.86f, 19f, 11.72f, 18.95f, 11.61f, 18.85f)
                lineTo(9.46f, 16.97f)
                curveTo(8.78f, 16.37f, 8.69f, 15.35f, 9.26f, 14.64f)
                curveTo(9.83f, 13.92f, 10.86f, 13.79f, 11.6f, 14.34f)
                lineTo(12f, 14.64f)
                lineTo(12.4f, 14.34f)
                curveTo(13.14f, 13.79f, 14.17f, 13.92f, 14.74f, 14.64f)
                curveTo(15.31f, 15.35f, 15.22f, 16.37f, 14.54f, 16.97f)
                close()
            }
        }.build()

        return _FolderFavorite!!
    }

@Suppress("ObjectPropertyName")
private var _FolderFavorite: ImageVector? = null
