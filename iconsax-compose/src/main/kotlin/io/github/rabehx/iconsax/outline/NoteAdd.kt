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

val Iconsax.Outline.NoteAdd: ImageVector
    get() {
        if (_NoteAdd != null) {
            return _NoteAdd!!
        }
        _NoteAdd = ImageVector.Builder(
            name = "Outline.NoteAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.561f, 18.75f)
                curveTo(9.151f, 18.75f, 8.811f, 18.41f, 8.811f, 18f)
                verticalLineTo(13f)
                curveTo(8.811f, 12.59f, 9.151f, 12.25f, 9.561f, 12.25f)
                curveTo(9.971f, 12.25f, 10.311f, 12.59f, 10.311f, 13f)
                verticalLineTo(18f)
                curveTo(10.311f, 18.41f, 9.971f, 18.75f, 9.561f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 16.25f)
                horizontalLineTo(7f)
                curveTo(6.59f, 16.25f, 6.25f, 15.91f, 6.25f, 15.5f)
                curveTo(6.25f, 15.09f, 6.59f, 14.75f, 7f, 14.75f)
                horizontalLineTo(12f)
                curveTo(12.41f, 14.75f, 12.75f, 15.09f, 12.75f, 15.5f)
                curveTo(12.75f, 15.91f, 12.41f, 16.25f, 12f, 16.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 5.75f)
                curveTo(7.59f, 5.75f, 7.25f, 5.41f, 7.25f, 5f)
                verticalLineTo(2f)
                curveTo(7.25f, 1.59f, 7.59f, 1.25f, 8f, 1.25f)
                curveTo(8.41f, 1.25f, 8.75f, 1.59f, 8.75f, 2f)
                verticalLineTo(5f)
                curveTo(8.75f, 5.41f, 8.41f, 5.75f, 8f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 5.75f)
                curveTo(15.59f, 5.75f, 15.25f, 5.41f, 15.25f, 5f)
                verticalLineTo(2f)
                curveTo(15.25f, 1.59f, 15.59f, 1.25f, 16f, 1.25f)
                curveTo(16.41f, 1.25f, 16.75f, 1.59f, 16.75f, 2f)
                verticalLineTo(5f)
                curveTo(16.75f, 5.41f, 16.41f, 5.75f, 16f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.85f, 22.81f)
                curveTo(6.38f, 22.81f, 4.75f, 22.27f, 3.73f, 21.11f)
                curveTo(2.55f, 19.78f, 2.36f, 17.79f, 2.32f, 16.02f)
                lineTo(2.19f, 9.85f)
                curveTo(2.09f, 5.12f, 3.66f, 3.15f, 7.76f, 2.84f)
                lineTo(15.8f, 2.68f)
                curveTo(15.82f, 2.68f, 15.83f, 2.68f, 15.84f, 2.68f)
                curveTo(19.95f, 2.82f, 21.59f, 4.72f, 21.69f, 9.46f)
                lineTo(21.81f, 15.63f)
                curveTo(21.85f, 17.4f, 21.73f, 19.4f, 20.61f, 20.77f)
                curveTo(19.59f, 22.02f, 17.87f, 22.63f, 15.2f, 22.69f)
                lineTo(9.2f, 22.81f)
                curveTo(9.08f, 22.81f, 8.96f, 22.81f, 8.85f, 22.81f)
                close()
                moveTo(15.8f, 4.17f)
                lineTo(7.83f, 4.33f)
                curveTo(5.03f, 4.55f, 3.6f, 5.45f, 3.69f, 9.82f)
                lineTo(3.82f, 15.99f)
                curveTo(3.86f, 18.11f, 4.17f, 19.35f, 4.85f, 20.12f)
                curveTo(5.61f, 20.98f, 6.98f, 21.36f, 9.18f, 21.31f)
                lineTo(15.18f, 21.19f)
                curveTo(17.37f, 21.15f, 18.73f, 20.71f, 19.46f, 19.82f)
                curveTo(20.11f, 19.03f, 20.37f, 17.78f, 20.32f, 15.66f)
                lineTo(20.2f, 9.49f)
                curveTo(20.1f, 5.13f, 18.64f, 4.27f, 15.8f, 4.17f)
                close()
            }
        }.build()

        return _NoteAdd!!
    }

@Suppress("ObjectPropertyName")
private var _NoteAdd: ImageVector? = null
