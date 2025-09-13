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


val Iconsax.Filled.FolderCross: ImageVector
    get() {
        if (_FolderCross != null) {
            return _FolderCross!!
        }
        _FolderCross = ImageVector.Builder(
            name = "Filled.FolderCross",
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
                moveTo(14.34f, 18.28f)
                curveTo(14.19f, 18.42f, 14f, 18.5f, 13.81f, 18.5f)
                curveTo(13.62f, 18.5f, 13.42f, 18.42f, 13.28f, 18.28f)
                lineTo(12.04f, 17.04f)
                lineTo(10.76f, 18.32f)
                curveTo(10.62f, 18.46f, 10.42f, 18.54f, 10.23f, 18.54f)
                curveTo(10.04f, 18.54f, 9.85f, 18.46f, 9.7f, 18.32f)
                curveTo(9.41f, 18.03f, 9.41f, 17.55f, 9.7f, 17.26f)
                lineTo(10.98f, 15.98f)
                lineTo(9.74f, 14.74f)
                curveTo(9.45f, 14.45f, 9.45f, 13.97f, 9.74f, 13.68f)
                curveTo(10.04f, 13.39f, 10.51f, 13.39f, 10.8f, 13.68f)
                lineTo(12.04f, 14.92f)
                lineTo(13.24f, 13.72f)
                curveTo(13.53f, 13.43f, 14f, 13.43f, 14.3f, 13.72f)
                curveTo(14.59f, 14.02f, 14.59f, 14.49f, 14.3f, 14.78f)
                lineTo(13.1f, 15.98f)
                lineTo(14.34f, 17.22f)
                curveTo(14.63f, 17.51f, 14.63f, 17.99f, 14.34f, 18.28f)
                close()
            }
        }.build()

        return _FolderCross!!
    }

@Suppress("ObjectPropertyName")
private var _FolderCross: ImageVector? = null
