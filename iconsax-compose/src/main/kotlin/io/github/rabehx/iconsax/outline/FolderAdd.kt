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

val Iconsax.Outline.FolderAdd: ImageVector
    get() {
        if (_FolderAdd != null) {
            return _FolderAdd!!
        }
        _FolderAdd = ImageVector.Builder(
            name = "Outline.FolderAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.061f, 17.25f)
                curveTo(11.651f, 17.25f, 11.311f, 16.91f, 11.311f, 16.5f)
                verticalLineTo(11.5f)
                curveTo(11.311f, 11.09f, 11.651f, 10.75f, 12.061f, 10.75f)
                curveTo(12.47f, 10.75f, 12.811f, 11.09f, 12.811f, 11.5f)
                verticalLineTo(16.5f)
                curveTo(12.811f, 16.91f, 12.47f, 17.25f, 12.061f, 17.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.5f, 14.75f)
                horizontalLineTo(9.5f)
                curveTo(9.09f, 14.75f, 8.75f, 14.41f, 8.75f, 14f)
                curveTo(8.75f, 13.59f, 9.09f, 13.25f, 9.5f, 13.25f)
                horizontalLineTo(14.5f)
                curveTo(14.91f, 13.25f, 15.25f, 13.59f, 15.25f, 14f)
                curveTo(15.25f, 14.41f, 14.91f, 14.75f, 14.5f, 14.75f)
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

        return _FolderAdd!!
    }

@Suppress("ObjectPropertyName")
private var _FolderAdd: ImageVector? = null
