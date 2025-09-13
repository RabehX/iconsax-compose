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

val Iconsax.Outline.Ghost: ImageVector
    get() {
        if (_Ghost != null) {
            return _Ghost!!
        }
        _Ghost = ImageVector.Builder(
            name = "Outline.Ghost",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.33f, 22.75f)
                curveTo(14.91f, 22.75f, 14.48f, 22.6f, 14.15f, 22.3f)
                lineTo(12.15f, 20.47f)
                curveTo(12.07f, 20.4f, 11.91f, 20.4f, 11.82f, 20.47f)
                lineTo(9.83f, 22.3f)
                curveTo(9.17f, 22.91f, 8.14f, 22.9f, 7.48f, 22.3f)
                lineTo(5.48f, 20.47f)
                curveTo(5.4f, 20.4f, 5.24f, 20.4f, 5.15f, 20.47f)
                lineTo(4.16f, 21.38f)
                curveTo(3.25f, 22.21f, 2.53f, 22.08f, 2.18f, 21.92f)
                curveTo(1.83f, 21.76f, 1.24f, 21.32f, 1.24f, 20.07f)
                verticalLineTo(12.18f)
                curveTo(1.24f, 6.15f, 6.06f, 1.25f, 11.99f, 1.25f)
                curveTo(17.92f, 1.25f, 22.74f, 6.15f, 22.74f, 12.18f)
                verticalLineTo(20.07f)
                curveTo(22.74f, 21.32f, 22.15f, 21.77f, 21.8f, 21.92f)
                curveTo(21.45f, 22.07f, 20.73f, 22.21f, 19.82f, 21.38f)
                lineTo(18.82f, 20.47f)
                curveTo(18.74f, 20.4f, 18.58f, 20.4f, 18.5f, 20.47f)
                lineTo(16.5f, 22.3f)
                curveTo(16.18f, 22.6f, 15.76f, 22.75f, 15.33f, 22.75f)
                close()
                moveTo(12f, 18.91f)
                curveTo(12.42f, 18.91f, 12.85f, 19.06f, 13.17f, 19.36f)
                lineTo(15.17f, 21.19f)
                curveTo(15.25f, 21.26f, 15.41f, 21.26f, 15.49f, 21.19f)
                lineTo(17.49f, 19.36f)
                curveTo(18.15f, 18.76f, 19.18f, 18.76f, 19.84f, 19.36f)
                lineTo(20.84f, 20.27f)
                curveTo(21.01f, 20.42f, 21.12f, 20.49f, 21.19f, 20.51f)
                curveTo(21.22f, 20.44f, 21.25f, 20.3f, 21.25f, 20.06f)
                verticalLineTo(12.17f)
                curveTo(21.25f, 6.97f, 17.1f, 2.74f, 12f, 2.74f)
                curveTo(6.9f, 2.74f, 2.75f, 6.97f, 2.75f, 12.17f)
                verticalLineTo(20.06f)
                curveTo(2.75f, 20.3f, 2.79f, 20.44f, 2.81f, 20.51f)
                curveTo(2.88f, 20.48f, 3f, 20.42f, 3.16f, 20.27f)
                lineTo(4.16f, 19.36f)
                curveTo(4.82f, 18.76f, 5.85f, 18.76f, 6.51f, 19.36f)
                lineTo(8.51f, 21.19f)
                curveTo(8.59f, 21.26f, 8.75f, 21.26f, 8.83f, 21.19f)
                lineTo(10.83f, 19.36f)
                curveTo(11.15f, 19.06f, 11.58f, 18.91f, 12f, 18.91f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 16.07f)
                curveTo(10.43f, 16.07f, 8.86f, 15.58f, 7.55f, 14.6f)
                curveTo(7.22f, 14.35f, 7.15f, 13.88f, 7.4f, 13.55f)
                curveTo(7.65f, 13.22f, 8.12f, 13.15f, 8.45f, 13.4f)
                curveTo(10.54f, 14.97f, 13.46f, 14.97f, 15.55f, 13.4f)
                curveTo(15.88f, 13.15f, 16.35f, 13.22f, 16.6f, 13.55f)
                curveTo(16.85f, 13.88f, 16.78f, 14.35f, 16.45f, 14.6f)
                curveTo(15.14f, 15.58f, 13.57f, 16.07f, 12f, 16.07f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 11.75f)
                curveTo(10.48f, 11.75f, 9.25f, 10.52f, 9.25f, 9f)
                curveTo(9.25f, 7.48f, 10.48f, 6.25f, 12f, 6.25f)
                curveTo(13.52f, 6.25f, 14.75f, 7.48f, 14.75f, 9f)
                curveTo(14.75f, 10.52f, 13.52f, 11.75f, 12f, 11.75f)
                close()
                moveTo(12f, 7.75f)
                curveTo(11.31f, 7.75f, 10.75f, 8.31f, 10.75f, 9f)
                curveTo(10.75f, 9.69f, 11.31f, 10.25f, 12f, 10.25f)
                curveTo(12.69f, 10.25f, 13.25f, 9.69f, 13.25f, 9f)
                curveTo(13.25f, 8.31f, 12.69f, 7.75f, 12f, 7.75f)
                close()
            }
        }.build()

        return _Ghost!!
    }

@Suppress("ObjectPropertyName")
private var _Ghost: ImageVector? = null
