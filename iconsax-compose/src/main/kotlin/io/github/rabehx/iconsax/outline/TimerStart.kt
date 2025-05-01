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

val Iconsax.Outline.TimerStart: ImageVector
    get() {
        if (_TimerStart != null) {
            return _TimerStart!!
        }
        _TimerStart = ImageVector.Builder(
            name = "Outline.TimerStart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 13.75f)
                curveTo(11.59f, 13.75f, 11.25f, 13.41f, 11.25f, 13f)
                verticalLineTo(8f)
                curveTo(11.25f, 7.59f, 11.59f, 7.25f, 12f, 7.25f)
                curveTo(12.41f, 7.25f, 12.75f, 7.59f, 12.75f, 8f)
                verticalLineTo(13f)
                curveTo(12.75f, 13.41f, 12.41f, 13.75f, 12f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(6.76f, 22.75f, 2.5f, 18.49f, 2.5f, 13.25f)
                curveTo(2.5f, 8.01f, 6.76f, 3.75f, 12f, 3.75f)
                curveTo(17.24f, 3.75f, 21.5f, 8.01f, 21.5f, 13.25f)
                curveTo(21.5f, 13.66f, 21.16f, 14f, 20.75f, 14f)
                curveTo(20.34f, 14f, 20f, 13.66f, 20f, 13.25f)
                curveTo(20f, 8.84f, 16.41f, 5.25f, 12f, 5.25f)
                curveTo(7.59f, 5.25f, 4f, 8.84f, 4f, 13.25f)
                curveTo(4f, 17.66f, 7.59f, 21.25f, 12f, 21.25f)
                curveTo(12.41f, 21.25f, 12.75f, 21.59f, 12.75f, 22f)
                curveTo(12.75f, 22.41f, 12.41f, 22.75f, 12f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 2.75f)
                horizontalLineTo(9f)
                curveTo(8.59f, 2.75f, 8.25f, 2.41f, 8.25f, 2f)
                curveTo(8.25f, 1.59f, 8.59f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(15.41f, 1.25f, 15.75f, 1.59f, 15.75f, 2f)
                curveTo(15.75f, 2.41f, 15.41f, 2.75f, 15f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.15f, 22.02f)
                curveTo(15.8f, 22.02f, 15.48f, 21.94f, 15.19f, 21.77f)
                curveTo(14.53f, 21.39f, 14.15f, 20.62f, 14.15f, 19.66f)
                verticalLineTo(17.35f)
                curveTo(14.15f, 16.39f, 14.53f, 15.62f, 15.19f, 15.24f)
                curveTo(15.85f, 14.86f, 16.7f, 14.92f, 17.53f, 15.39f)
                lineTo(19.53f, 16.55f)
                curveTo(20.36f, 17.03f, 20.84f, 17.74f, 20.84f, 18.5f)
                curveTo(20.84f, 19.26f, 20.36f, 19.97f, 19.53f, 20.45f)
                lineTo(17.53f, 21.61f)
                curveTo(17.07f, 21.88f, 16.6f, 22.02f, 16.15f, 22.02f)
                close()
                moveTo(16.16f, 16.48f)
                curveTo(16.08f, 16.48f, 16f, 16.5f, 15.94f, 16.53f)
                curveTo(15.76f, 16.63f, 15.65f, 16.94f, 15.65f, 17.34f)
                verticalLineTo(19.65f)
                curveTo(15.65f, 20.05f, 15.76f, 20.36f, 15.94f, 20.46f)
                curveTo(16.12f, 20.56f, 16.44f, 20.51f, 16.78f, 20.31f)
                lineTo(18.78f, 19.15f)
                curveTo(19.13f, 18.95f, 19.34f, 18.7f, 19.34f, 18.5f)
                curveTo(19.34f, 18.3f, 19.13f, 18.05f, 18.78f, 17.85f)
                lineTo(16.78f, 16.69f)
                curveTo(16.55f, 16.55f, 16.33f, 16.48f, 16.16f, 16.48f)
                close()
            }
        }.build()

        return _TimerStart!!
    }

@Suppress("ObjectPropertyName")
private var _TimerStart: ImageVector? = null
