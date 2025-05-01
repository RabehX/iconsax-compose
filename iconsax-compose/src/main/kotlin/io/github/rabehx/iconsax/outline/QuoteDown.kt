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

val Iconsax.Outline.QuoteDown: ImageVector
    get() {
        if (_QuoteDown != null) {
            return _QuoteDown!!
        }
        _QuoteDown = ImageVector.Builder(
            name = "Outline.QuoteDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22.001f, 12.4f)
                horizontalLineTo(16.201f)
                curveTo(14.301f, 12.4f, 12.871f, 10.97f, 12.871f, 9.07f)
                verticalLineTo(5.85f)
                curveTo(12.871f, 3.95f, 14.301f, 2.52f, 16.201f, 2.52f)
                horizontalLineTo(19.421f)
                curveTo(21.251f, 2.52f, 22.751f, 4.01f, 22.751f, 5.85f)
                verticalLineTo(11.65f)
                curveTo(22.751f, 12.07f, 22.411f, 12.4f, 22.001f, 12.4f)
                close()
                moveTo(16.201f, 4.03f)
                curveTo(15.141f, 4.03f, 14.371f, 4.8f, 14.371f, 5.86f)
                verticalLineTo(9.08f)
                curveTo(14.371f, 10.14f, 15.141f, 10.91f, 16.201f, 10.91f)
                horizontalLineTo(21.251f)
                verticalLineTo(5.86f)
                curveTo(21.251f, 4.85f, 20.431f, 4.03f, 19.421f, 4.03f)
                horizontalLineTo(16.201f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.471f, 21.47f)
                curveTo(17.211f, 21.47f, 16.961f, 21.34f, 16.82f, 21.1f)
                curveTo(16.611f, 20.74f, 16.73f, 20.28f, 17.08f, 20.07f)
                curveTo(20.31f, 18.15f, 21.25f, 17.35f, 21.25f, 11.65f)
                curveTo(21.25f, 11.24f, 21.59f, 10.9f, 22f, 10.9f)
                curveTo(22.41f, 10.9f, 22.75f, 11.24f, 22.75f, 11.65f)
                curveTo(22.75f, 17.9f, 21.48f, 19.21f, 17.851f, 21.36f)
                curveTo(17.73f, 21.44f, 17.601f, 21.47f, 17.471f, 21.47f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.37f, 12.4f)
                horizontalLineTo(4.57f)
                curveTo(2.67f, 12.4f, 1.24f, 10.97f, 1.24f, 9.07f)
                verticalLineTo(5.85f)
                curveTo(1.24f, 3.95f, 2.67f, 2.52f, 4.57f, 2.52f)
                horizontalLineTo(7.8f)
                curveTo(9.63f, 2.52f, 11.13f, 4.01f, 11.13f, 5.85f)
                verticalLineTo(11.65f)
                curveTo(11.12f, 12.07f, 10.79f, 12.4f, 10.37f, 12.4f)
                close()
                moveTo(4.58f, 4.03f)
                curveTo(3.52f, 4.03f, 2.75f, 4.8f, 2.75f, 5.86f)
                verticalLineTo(9.08f)
                curveTo(2.75f, 10.14f, 3.52f, 10.91f, 4.58f, 10.91f)
                horizontalLineTo(9.63f)
                verticalLineTo(5.86f)
                curveTo(9.63f, 4.85f, 8.81f, 4.03f, 7.8f, 4.03f)
                horizontalLineTo(4.58f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.84f, 21.47f)
                curveTo(5.58f, 21.47f, 5.33f, 21.34f, 5.19f, 21.1f)
                curveTo(4.98f, 20.74f, 5.1f, 20.28f, 5.45f, 20.07f)
                curveTo(8.68f, 18.15f, 9.62f, 17.35f, 9.62f, 11.65f)
                curveTo(9.62f, 11.24f, 9.96f, 10.9f, 10.37f, 10.9f)
                curveTo(10.78f, 10.9f, 11.12f, 11.24f, 11.12f, 11.65f)
                curveTo(11.12f, 17.9f, 9.85f, 19.21f, 6.22f, 21.36f)
                curveTo(6.1f, 21.44f, 5.97f, 21.47f, 5.84f, 21.47f)
                close()
            }
        }.build()

        return _QuoteDown!!
    }

@Suppress("ObjectPropertyName")
private var _QuoteDown: ImageVector? = null
