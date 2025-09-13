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

val Iconsax.Outline.NoteSquare: ImageVector
    get() {
        if (_NoteSquare != null) {
            return _NoteSquare!!
        }
        _NoteSquare = ImageVector.Builder(
            name = "Outline.NoteSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(10f)
                curveTo(22.75f, 10.41f, 22.41f, 10.75f, 22f, 10.75f)
                curveTo(21.59f, 10.75f, 21.25f, 10.41f, 21.25f, 10f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(11f)
                curveTo(11.41f, 21.25f, 11.75f, 21.59f, 11.75f, 22f)
                curveTo(11.75f, 22.41f, 11.41f, 22.75f, 11f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.51f, 22.75f)
                curveTo(14f, 22.75f, 12.76f, 21.52f, 12.76f, 20f)
                curveTo(12.76f, 18.48f, 13.99f, 17.25f, 15.51f, 17.25f)
                curveTo(17.03f, 17.25f, 18.26f, 18.48f, 18.26f, 20f)
                curveTo(18.26f, 21.52f, 17.02f, 22.75f, 15.51f, 22.75f)
                close()
                moveTo(15.51f, 18.76f)
                curveTo(14.82f, 18.76f, 14.26f, 19.32f, 14.26f, 20.01f)
                curveTo(14.26f, 20.7f, 14.82f, 21.26f, 15.51f, 21.26f)
                curveTo(16.2f, 21.26f, 16.76f, 20.7f, 16.76f, 20.01f)
                curveTo(16.76f, 19.32f, 16.2f, 18.76f, 15.51f, 18.76f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.51f, 20.75f)
                curveTo(17.1f, 20.75f, 16.76f, 20.41f, 16.76f, 20f)
                verticalLineTo(13.01f)
                curveTo(16.76f, 12.6f, 17.1f, 12.26f, 17.51f, 12.26f)
                curveTo(17.92f, 12.26f, 18.26f, 12.6f, 18.26f, 13.01f)
                verticalLineTo(20f)
                curveTo(18.26f, 20.42f, 17.92f, 20.75f, 17.51f, 20.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.08f, 16.5f)
                curveTo(20.87f, 16.5f, 20.66f, 16.47f, 20.45f, 16.39f)
                lineTo(18.24f, 15.66f)
                curveTo(17.39f, 15.38f, 16.76f, 14.49f, 16.76f, 13.6f)
                verticalLineTo(13.01f)
                curveTo(16.76f, 12.4f, 17.01f, 11.87f, 17.46f, 11.55f)
                curveTo(17.91f, 11.23f, 18.49f, 11.16f, 19.06f, 11.35f)
                lineTo(21.27f, 12.09f)
                curveTo(22.12f, 12.37f, 22.75f, 13.26f, 22.75f, 14.15f)
                verticalLineTo(14.74f)
                curveTo(22.75f, 15.35f, 22.5f, 15.88f, 22.05f, 16.2f)
                curveTo(21.77f, 16.4f, 21.43f, 16.5f, 21.08f, 16.5f)
                close()
                moveTo(18.43f, 12.75f)
                curveTo(18.39f, 12.75f, 18.35f, 12.76f, 18.33f, 12.77f)
                curveTo(18.29f, 12.8f, 18.26f, 12.87f, 18.26f, 13.01f)
                verticalLineTo(13.6f)
                curveTo(18.26f, 13.84f, 18.49f, 14.16f, 18.72f, 14.24f)
                lineTo(20.93f, 14.97f)
                curveTo(21.06f, 15.01f, 21.15f, 15f, 21.18f, 14.98f)
                curveTo(21.22f, 14.95f, 21.26f, 14.88f, 21.26f, 14.74f)
                verticalLineTo(14.15f)
                curveTo(21.26f, 13.91f, 21.03f, 13.59f, 20.8f, 13.51f)
                lineTo(18.59f, 12.78f)
                curveTo(18.52f, 12.76f, 18.47f, 12.75f, 18.43f, 12.75f)
                close()
            }
        }.build()

        return _NoteSquare!!
    }

@Suppress("ObjectPropertyName")
private var _NoteSquare: ImageVector? = null
