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

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.FolderOpen: ImageVector
    get() {
        if (_FolderOpen != null) {
            return _FolderOpen!!
        }
        _FolderOpen = ImageVector.Builder(
            name = "Outline.FolderOpen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.291f, 22.75f)
                horizontalLineTo(5.711f)
                curveTo(2.311f, 22.75f, 2.131f, 20.88f, 1.981f, 19.37f)
                lineTo(1.581f, 14.36f)
                curveTo(1.491f, 13.39f, 1.771f, 12.42f, 2.391f, 11.64f)
                curveTo(3.131f, 10.74f, 4.181f, 10.25f, 5.311f, 10.25f)
                horizontalLineTo(18.691f)
                curveTo(19.801f, 10.25f, 20.851f, 10.74f, 21.561f, 11.59f)
                lineTo(21.731f, 11.82f)
                curveTo(22.271f, 12.56f, 22.511f, 13.46f, 22.421f, 14.37f)
                lineTo(22.021f, 19.36f)
                curveTo(21.871f, 20.88f, 21.691f, 22.75f, 18.291f, 22.75f)
                close()
                moveTo(5.311f, 11.75f)
                curveTo(4.641f, 11.75f, 4.001f, 12.05f, 3.581f, 12.57f)
                lineTo(3.511f, 12.64f)
                curveTo(3.191f, 13.05f, 3.021f, 13.63f, 3.081f, 14.23f)
                lineTo(3.481f, 19.24f)
                curveTo(3.621f, 20.7f, 3.681f, 21.25f, 5.711f, 21.25f)
                horizontalLineTo(18.291f)
                curveTo(20.331f, 21.25f, 20.381f, 20.7f, 20.521f, 19.23f)
                lineTo(20.921f, 14.22f)
                curveTo(20.981f, 13.63f, 20.811f, 13.04f, 20.421f, 12.58f)
                lineTo(20.321f, 12.46f)
                curveTo(19.871f, 11.99f, 19.301f, 11.75f, 18.681f, 11.75f)
                horizontalLineTo(5.311f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.5f, 12.22f)
                curveTo(20.09f, 12.22f, 19.75f, 11.88f, 19.75f, 11.47f)
                verticalLineTo(9.68f)
                curveTo(19.75f, 6.7f, 19.23f, 6.18f, 16.25f, 6.18f)
                horizontalLineTo(13.7f)
                curveTo(12.57f, 6.18f, 12.18f, 5.78f, 11.75f, 5.21f)
                lineTo(10.46f, 3.5f)
                curveTo(10.02f, 2.92f, 9.92f, 2.78f, 9.02f, 2.78f)
                horizontalLineTo(7.75f)
                curveTo(4.77f, 2.78f, 4.25f, 3.3f, 4.25f, 6.28f)
                verticalLineTo(11.43f)
                curveTo(4.25f, 11.84f, 3.91f, 12.18f, 3.5f, 12.18f)
                curveTo(3.09f, 12.18f, 2.75f, 11.84f, 2.75f, 11.43f)
                verticalLineTo(6.28f)
                curveTo(2.75f, 2.45f, 3.92f, 1.28f, 7.75f, 1.28f)
                horizontalLineTo(9.03f)
                curveTo(10.57f, 1.28f, 11.05f, 1.78f, 11.67f, 2.6f)
                lineTo(12.95f, 4.3f)
                curveTo(13.22f, 4.66f, 13.24f, 4.68f, 13.71f, 4.68f)
                horizontalLineTo(16.26f)
                curveTo(20.09f, 4.68f, 21.26f, 5.85f, 21.26f, 9.68f)
                verticalLineTo(11.47f)
                curveTo(21.25f, 11.88f, 20.91f, 12.22f, 20.5f, 12.22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.57f, 17.75f)
                horizontalLineTo(9.43f)
                curveTo(9.02f, 17.75f, 8.68f, 17.41f, 8.68f, 17f)
                curveTo(8.68f, 16.59f, 9.02f, 16.25f, 9.43f, 16.25f)
                horizontalLineTo(14.57f)
                curveTo(14.98f, 16.25f, 15.32f, 16.59f, 15.32f, 17f)
                curveTo(15.32f, 17.41f, 14.99f, 17.75f, 14.57f, 17.75f)
                close()
            }
        }.build()

        return _FolderOpen!!
    }

@Suppress("ObjectPropertyName")
private var _FolderOpen: ImageVector? = null
