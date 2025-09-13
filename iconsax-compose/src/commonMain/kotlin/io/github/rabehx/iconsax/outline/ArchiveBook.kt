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

val Iconsax.Outline.ArchiveBook: ImageVector
    get() {
        if (_ArchiveBook != null) {
            return _ArchiveBook!!
        }
        _ArchiveBook = ImageVector.Builder(
            name = "Outline.ArchiveBook",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 22.75f)
                horizontalLineTo(8f)
                curveTo(4.35f, 22.75f, 2.25f, 20.65f, 2.25f, 17f)
                verticalLineTo(7f)
                curveTo(2.25f, 3.35f, 4.35f, 1.25f, 8f, 1.25f)
                horizontalLineTo(16f)
                curveTo(19.65f, 1.25f, 21.75f, 3.35f, 21.75f, 7f)
                verticalLineTo(17f)
                curveTo(21.75f, 20.65f, 19.65f, 22.75f, 16f, 22.75f)
                close()
                moveTo(8f, 2.75f)
                curveTo(5.14f, 2.75f, 3.75f, 4.14f, 3.75f, 7f)
                verticalLineTo(17f)
                curveTo(3.75f, 19.86f, 5.14f, 21.25f, 8f, 21.25f)
                horizontalLineTo(16f)
                curveTo(18.86f, 21.25f, 20.25f, 19.86f, 20.25f, 17f)
                verticalLineTo(7f)
                curveTo(20.25f, 4.14f, 18.86f, 2.75f, 16f, 2.75f)
                horizontalLineTo(8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 11.11f)
                curveTo(8.83f, 11.11f, 8.66f, 11.08f, 8.5f, 11.01f)
                curveTo(8.04f, 10.81f, 7.75f, 10.36f, 7.75f, 9.87f)
                verticalLineTo(2f)
                curveTo(7.75f, 1.59f, 8.09f, 1.25f, 8.5f, 1.25f)
                horizontalLineTo(15.5f)
                curveTo(15.91f, 1.25f, 16.25f, 1.59f, 16.25f, 2f)
                verticalLineTo(9.86f)
                curveTo(16.25f, 10.36f, 15.96f, 10.81f, 15.5f, 11f)
                curveTo(15.05f, 11.2f, 14.52f, 11.11f, 14.15f, 10.77f)
                lineTo(12f, 8.8f)
                lineTo(9.85f, 10.78f)
                curveTo(9.61f, 11f, 9.31f, 11.11f, 9f, 11.11f)
                close()
                moveTo(12f, 7.21f)
                curveTo(12.3f, 7.21f, 12.61f, 7.32f, 12.85f, 7.54f)
                lineTo(14.75f, 9.29f)
                verticalLineTo(2.75f)
                horizontalLineTo(9.25f)
                verticalLineTo(9.29f)
                lineTo(11.15f, 7.54f)
                curveTo(11.39f, 7.32f, 11.7f, 7.21f, 12f, 7.21f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.5f, 14.75f)
                horizontalLineTo(13.25f)
                curveTo(12.84f, 14.75f, 12.5f, 14.41f, 12.5f, 14f)
                curveTo(12.5f, 13.59f, 12.84f, 13.25f, 13.25f, 13.25f)
                horizontalLineTo(17.5f)
                curveTo(17.91f, 13.25f, 18.25f, 13.59f, 18.25f, 14f)
                curveTo(18.25f, 14.41f, 17.91f, 14.75f, 17.5f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.5f, 18.75f)
                horizontalLineTo(9f)
                curveTo(8.59f, 18.75f, 8.25f, 18.41f, 8.25f, 18f)
                curveTo(8.25f, 17.59f, 8.59f, 17.25f, 9f, 17.25f)
                horizontalLineTo(17.5f)
                curveTo(17.91f, 17.25f, 18.25f, 17.59f, 18.25f, 18f)
                curveTo(18.25f, 18.41f, 17.91f, 18.75f, 17.5f, 18.75f)
                close()
            }
        }.build()

        return _ArchiveBook!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveBook: ImageVector? = null
