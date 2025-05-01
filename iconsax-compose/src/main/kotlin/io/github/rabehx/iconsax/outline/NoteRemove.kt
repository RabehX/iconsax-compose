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

val Iconsax.Outline.NoteRemove: ImageVector
    get() {
        if (_NoteRemove != null) {
            return _NoteRemove!!
        }
        _NoteRemove = ImageVector.Builder(
            name = "Outline.NoteRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 14.75f)
                horizontalLineTo(7f)
                curveTo(6.59f, 14.75f, 6.25f, 14.41f, 6.25f, 14f)
                curveTo(6.25f, 13.59f, 6.59f, 13.25f, 7f, 13.25f)
                horizontalLineTo(12f)
                curveTo(12.41f, 13.25f, 12.75f, 13.59f, 12.75f, 14f)
                curveTo(12.75f, 14.41f, 12.41f, 14.75f, 12f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.999f, 6.71f)
                curveTo(6.809f, 6.71f, 6.619f, 6.64f, 6.469f, 6.49f)
                lineTo(2.719f, 2.74f)
                curveTo(2.429f, 2.45f, 2.429f, 1.97f, 2.719f, 1.68f)
                curveTo(3.009f, 1.39f, 3.489f, 1.39f, 3.779f, 1.68f)
                lineTo(7.529f, 5.43f)
                curveTo(7.819f, 5.72f, 7.819f, 6.2f, 7.529f, 6.49f)
                curveTo(7.379f, 6.63f, 7.189f, 6.71f, 6.999f, 6.71f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.21f, 6.75f)
                curveTo(3.02f, 6.75f, 2.83f, 6.68f, 2.68f, 6.53f)
                curveTo(2.39f, 6.24f, 2.39f, 5.76f, 2.68f, 5.47f)
                lineTo(6.43f, 1.72f)
                curveTo(6.72f, 1.43f, 7.2f, 1.43f, 7.49f, 1.72f)
                curveTo(7.78f, 2.01f, 7.78f, 2.49f, 7.49f, 2.78f)
                lineTo(3.74f, 6.53f)
                curveTo(3.6f, 6.68f, 3.4f, 6.75f, 3.21f, 6.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 10.75f)
                horizontalLineTo(7f)
                curveTo(6.59f, 10.75f, 6.25f, 10.41f, 6.25f, 10f)
                curveTo(6.25f, 9.59f, 6.59f, 9.25f, 7f, 9.25f)
                horizontalLineTo(15f)
                curveTo(15.41f, 9.25f, 15.75f, 9.59f, 15.75f, 10f)
                curveTo(15.75f, 10.41f, 15.41f, 10.75f, 15f, 10.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 16.75f)
                curveTo(20.59f, 16.75f, 20.25f, 16.41f, 20.25f, 16f)
                verticalLineTo(7.99f)
                curveTo(20.25f, 3.76f, 18.81f, 2.9f, 15.96f, 2.75f)
                horizontalLineTo(10f)
                curveTo(9.59f, 2.75f, 9.25f, 2.41f, 9.25f, 2f)
                curveTo(9.25f, 1.59f, 9.59f, 1.25f, 10f, 1.25f)
                horizontalLineTo(16f)
                curveTo(20.1f, 1.47f, 21.75f, 3.42f, 21.75f, 7.99f)
                verticalLineTo(16f)
                curveTo(21.75f, 16.41f, 21.41f, 16.75f, 21f, 16.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.38f, 22.75f, 2.25f, 20.16f, 2.25f, 15.98f)
                verticalLineTo(9.01f)
                curveTo(2.25f, 8.6f, 2.59f, 8.26f, 3f, 8.26f)
                curveTo(3.41f, 8.26f, 3.75f, 8.6f, 3.75f, 9.01f)
                verticalLineTo(15.98f)
                curveTo(3.75f, 19.7f, 4.48f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(15.41f, 21.25f, 15.75f, 21.59f, 15.75f, 22f)
                curveTo(15.75f, 22.41f, 15.41f, 22.75f, 15f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                curveTo(14.9f, 22.75f, 14.81f, 22.73f, 14.71f, 22.69f)
                curveTo(14.43f, 22.57f, 14.25f, 22.3f, 14.25f, 22f)
                verticalLineTo(19f)
                curveTo(14.25f, 16.58f, 15.58f, 15.25f, 18f, 15.25f)
                horizontalLineTo(21f)
                curveTo(21.3f, 15.25f, 21.58f, 15.43f, 21.69f, 15.71f)
                curveTo(21.8f, 15.99f, 21.74f, 16.31f, 21.53f, 16.53f)
                lineTo(15.53f, 22.53f)
                curveTo(15.39f, 22.67f, 15.19f, 22.75f, 15f, 22.75f)
                close()
                moveTo(18f, 16.75f)
                curveTo(16.42f, 16.75f, 15.75f, 17.42f, 15.75f, 19f)
                verticalLineTo(20.19f)
                lineTo(19.19f, 16.75f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _NoteRemove!!
    }

@Suppress("ObjectPropertyName")
private var _NoteRemove: ImageVector? = null
