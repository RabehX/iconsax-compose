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


val Iconsax.Filled.FolderConnection: ImageVector
    get() {
        if (_FolderConnection != null) {
            return _FolderConnection!!
        }
        _FolderConnection = ImageVector.Builder(
            name = "Filled.FolderConnection",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.75f, 16f)
                horizontalLineTo(15.5f)
                curveTo(18.3f, 16f, 19f, 15.3f, 19f, 12.5f)
                verticalLineTo(8.3f)
                curveTo(19f, 5.5f, 18.3f, 4.8f, 15.5f, 4.8f)
                horizontalLineTo(13.4f)
                curveTo(12.7f, 4.8f, 12.55f, 4.59f, 12.28f, 4.24f)
                lineTo(11.23f, 2.84f)
                curveTo(10.83f, 2.31f, 10.6f, 2f, 9.55f, 2f)
                horizontalLineTo(8.5f)
                curveTo(5.7f, 2f, 5f, 2.7f, 5f, 5.5f)
                verticalLineTo(12.5f)
                curveTo(5f, 15.3f, 5.7f, 16f, 8.5f, 16f)
                horizontalLineTo(11.25f)
                verticalLineTo(19f)
                curveTo(11.25f, 19.05f, 11.27f, 19.09f, 11.28f, 19.14f)
                curveTo(10.76f, 19.34f, 10.34f, 19.76f, 10.14f, 20.28f)
                curveTo(10.09f, 20.27f, 10.05f, 20.25f, 10f, 20.25f)
                horizontalLineTo(6f)
                curveTo(5.59f, 20.25f, 5.25f, 20.59f, 5.25f, 21f)
                curveTo(5.25f, 21.41f, 5.59f, 21.75f, 6f, 21.75f)
                horizontalLineTo(10f)
                curveTo(10.05f, 21.75f, 10.09f, 21.73f, 10.14f, 21.72f)
                curveTo(10.43f, 22.47f, 11.15f, 23f, 12f, 23f)
                curveTo(12.85f, 23f, 13.57f, 22.47f, 13.86f, 21.72f)
                curveTo(13.91f, 21.73f, 13.95f, 21.75f, 14f, 21.75f)
                horizontalLineTo(18f)
                curveTo(18.41f, 21.75f, 18.75f, 21.41f, 18.75f, 21f)
                curveTo(18.75f, 20.59f, 18.41f, 20.25f, 18f, 20.25f)
                horizontalLineTo(14f)
                curveTo(13.95f, 20.25f, 13.91f, 20.27f, 13.86f, 20.28f)
                curveTo(13.66f, 19.76f, 13.24f, 19.34f, 12.72f, 19.14f)
                curveTo(12.73f, 19.09f, 12.75f, 19.05f, 12.75f, 19f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _FolderConnection!!
    }

@Suppress("ObjectPropertyName")
private var _FolderConnection: ImageVector? = null
