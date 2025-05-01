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

val Iconsax.Outline.FolderCross: ImageVector
    get() {
        if (_FolderCross != null) {
            return _FolderCross!!
        }
        _FolderCross = ImageVector.Builder(
            name = "Outline.FolderCross",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.811f, 16.48f)
                curveTo(13.621f, 16.48f, 13.431f, 16.41f, 13.281f, 16.26f)
                lineTo(9.741f, 12.72f)
                curveTo(9.451f, 12.43f, 9.451f, 11.95f, 9.741f, 11.66f)
                curveTo(10.031f, 11.37f, 10.511f, 11.37f, 10.801f, 11.66f)
                lineTo(14.341f, 15.2f)
                curveTo(14.631f, 15.49f, 14.631f, 15.97f, 14.341f, 16.26f)
                curveTo(14.191f, 16.4f, 14.001f, 16.48f, 13.811f, 16.48f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.23f, 16.52f)
                curveTo(10.04f, 16.52f, 9.85f, 16.45f, 9.7f, 16.3f)
                curveTo(9.41f, 16.01f, 9.41f, 15.53f, 9.7f, 15.24f)
                lineTo(13.24f, 11.7f)
                curveTo(13.53f, 11.41f, 14.01f, 11.41f, 14.3f, 11.7f)
                curveTo(14.59f, 11.99f, 14.59f, 12.47f, 14.3f, 12.76f)
                lineTo(10.76f, 16.3f)
                curveTo(10.62f, 16.44f, 10.42f, 16.52f, 10.23f, 16.52f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 22.75f)
                horizontalLineTo(7f)
                curveTo(2.59f, 22.75f, 1.25f, 21.41f, 1.25f, 17f)
                verticalLineTo(7f)
                curveTo(1.25f, 2.59f, 2.59f, 1.25f, 7f, 1.25f)
                horizontalLineTo(8.5f)
                curveTo(10.25f, 1.25f, 10.8f, 1.82f, 11.5f, 2.75f)
                lineTo(13f, 4.75f)
                curveTo(13.33f, 5.19f, 13.38f, 5.25f, 14f, 5.25f)
                horizontalLineTo(17f)
                curveTo(21.41f, 5.25f, 22.75f, 6.59f, 22.75f, 11f)
                verticalLineTo(17f)
                curveTo(22.75f, 21.41f, 21.41f, 22.75f, 17f, 22.75f)
                close()
                moveTo(7f, 2.75f)
                curveTo(3.43f, 2.75f, 2.75f, 3.43f, 2.75f, 7f)
                verticalLineTo(17f)
                curveTo(2.75f, 20.57f, 3.43f, 21.25f, 7f, 21.25f)
                horizontalLineTo(17f)
                curveTo(20.57f, 21.25f, 21.25f, 20.57f, 21.25f, 17f)
                verticalLineTo(11f)
                curveTo(21.25f, 7.43f, 20.57f, 6.75f, 17f, 6.75f)
                horizontalLineTo(14f)
                curveTo(12.72f, 6.75f, 12.3f, 6.31f, 11.8f, 5.65f)
                lineTo(10.3f, 3.65f)
                curveTo(9.78f, 2.96f, 9.63f, 2.75f, 8.5f, 2.75f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _FolderCross!!
    }

@Suppress("ObjectPropertyName")
private var _FolderCross: ImageVector? = null
