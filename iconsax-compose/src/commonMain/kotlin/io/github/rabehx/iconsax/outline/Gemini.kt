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

val Iconsax.Outline.Gemini: ImageVector
    get() {
        if (_Gemini != null) {
            return _Gemini!!
        }
        _Gemini = ImageVector.Builder(
            name = "Outline.Gemini",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 5.53f)
                curveTo(8.41f, 5.53f, 4.82f, 4.57f, 1.61f, 2.65f)
                curveTo(1.25f, 2.44f, 1.14f, 1.98f, 1.35f, 1.62f)
                curveTo(1.56f, 1.26f, 2.02f, 1.15f, 2.38f, 1.36f)
                curveTo(8.31f, 4.92f, 15.68f, 4.92f, 21.61f, 1.36f)
                curveTo(21.96f, 1.15f, 22.43f, 1.26f, 22.64f, 1.62f)
                curveTo(22.85f, 1.98f, 22.74f, 2.44f, 22.38f, 2.65f)
                curveTo(19.18f, 4.57f, 15.59f, 5.53f, 12f, 5.53f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 22.75f)
                curveTo(21.87f, 22.75f, 21.74f, 22.72f, 21.61f, 22.64f)
                curveTo(15.68f, 19.08f, 8.31f, 19.08f, 2.38f, 22.64f)
                curveTo(2.03f, 22.85f, 1.56f, 22.74f, 1.35f, 22.38f)
                curveTo(1.14f, 22.02f, 1.25f, 21.56f, 1.61f, 21.35f)
                curveTo(8.02f, 17.51f, 15.98f, 17.51f, 22.38f, 21.35f)
                curveTo(22.74f, 21.56f, 22.85f, 22.02f, 22.64f, 22.38f)
                curveTo(22.5f, 22.62f, 22.25f, 22.75f, 22f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.329f, 21.16f)
                curveTo(5.209f, 21.16f, 5.089f, 21.13f, 4.969f, 21.07f)
                curveTo(4.609f, 20.87f, 4.469f, 20.42f, 4.669f, 20.05f)
                curveTo(7.349f, 15.09f, 7.379f, 9.15f, 4.759f, 4.17f)
                lineTo(4.639f, 3.93f)
                curveTo(4.449f, 3.56f, 4.589f, 3.11f, 4.959f, 2.92f)
                curveTo(5.329f, 2.73f, 5.779f, 2.87f, 5.969f, 3.24f)
                lineTo(6.089f, 3.48f)
                curveTo(8.939f, 8.91f, 8.899f, 15.38f, 5.989f, 20.77f)
                curveTo(5.859f, 21.02f, 5.599f, 21.16f, 5.329f, 21.16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.67f, 21.16f)
                curveTo(18.4f, 21.16f, 18.15f, 21.02f, 18.01f, 20.77f)
                curveTo(15.1f, 15.37f, 15.06f, 8.91f, 17.91f, 3.48f)
                lineTo(18.03f, 3.24f)
                curveTo(18.22f, 2.87f, 18.68f, 2.73f, 19.04f, 2.92f)
                curveTo(19.41f, 3.11f, 19.55f, 3.57f, 19.36f, 3.93f)
                lineTo(19.24f, 4.17f)
                curveTo(16.62f, 9.16f, 16.66f, 15.1f, 19.33f, 20.05f)
                curveTo(19.53f, 20.42f, 19.39f, 20.87f, 19.03f, 21.07f)
                curveTo(18.91f, 21.13f, 18.79f, 21.16f, 18.67f, 21.16f)
                close()
            }
        }.build()

        return _Gemini!!
    }

@Suppress("ObjectPropertyName")
private var _Gemini: ImageVector? = null
