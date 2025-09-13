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

val Iconsax.Outline.ArrangeCircle: ImageVector
    get() {
        if (_ArrangeCircle != null) {
            return _ArrangeCircle!!
        }
        _ArrangeCircle = ImageVector.Builder(
            name = "Outline.ArrangeCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.86f, 10.64f)
                curveTo(16.67f, 10.64f, 16.48f, 10.57f, 16.33f, 10.42f)
                lineTo(13.29f, 7.38f)
                curveTo(13f, 7.09f, 13f, 6.61f, 13.29f, 6.32f)
                curveTo(13.58f, 6.03f, 14.06f, 6.03f, 14.35f, 6.32f)
                lineTo(17.39f, 9.36f)
                curveTo(17.68f, 9.65f, 17.68f, 10.13f, 17.39f, 10.42f)
                curveTo(17.24f, 10.56f, 17.05f, 10.64f, 16.86f, 10.64f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.82f, 17.9f)
                curveTo(13.41f, 17.9f, 13.07f, 17.56f, 13.07f, 17.15f)
                verticalLineTo(6.84f)
                curveTo(13.07f, 6.43f, 13.41f, 6.09f, 13.82f, 6.09f)
                curveTo(14.23f, 6.09f, 14.57f, 6.43f, 14.57f, 6.84f)
                verticalLineTo(17.15f)
                curveTo(14.57f, 17.57f, 14.23f, 17.9f, 13.82f, 17.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.18f, 17.9f)
                curveTo(9.99f, 17.9f, 9.8f, 17.83f, 9.65f, 17.68f)
                lineTo(6.61f, 14.64f)
                curveTo(6.32f, 14.35f, 6.32f, 13.87f, 6.61f, 13.58f)
                curveTo(6.9f, 13.29f, 7.38f, 13.29f, 7.67f, 13.58f)
                lineTo(10.71f, 16.62f)
                curveTo(11f, 16.91f, 11f, 17.39f, 10.71f, 17.68f)
                curveTo(10.57f, 17.83f, 10.38f, 17.9f, 10.18f, 17.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.18f, 17.9f)
                curveTo(9.77f, 17.9f, 9.43f, 17.56f, 9.43f, 17.15f)
                verticalLineTo(6.84f)
                curveTo(9.43f, 6.43f, 9.77f, 6.09f, 10.18f, 6.09f)
                curveTo(10.59f, 6.09f, 10.93f, 6.43f, 10.93f, 6.84f)
                verticalLineTo(17.15f)
                curveTo(10.93f, 17.57f, 10.6f, 17.9f, 10.18f, 17.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12f, 1.25f)
                curveTo(17.93f, 1.25f, 22.75f, 6.07f, 22.75f, 12f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12f, 22.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12f, 2.75f)
                close()
            }
        }.build()

        return _ArrangeCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ArrangeCircle: ImageVector? = null
