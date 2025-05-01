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

val Iconsax.Outline.QuoteUpCircle: ImageVector
    get() {
        if (_QuoteUpCircle != null) {
            return _QuoteUpCircle!!
        }
        _QuoteUpCircle = ImageVector.Builder(
            name = "Outline.QuoteUpCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.999f, 12.59f)
                horizontalLineTo(14.319f)
                curveTo(13.229f, 12.59f, 12.379f, 11.74f, 12.379f, 10.65f)
                verticalLineTo(9.16f)
                curveTo(12.379f, 8.07f, 13.229f, 7.22f, 14.319f, 7.22f)
                horizontalLineTo(15.809f)
                curveTo(16.879f, 7.22f, 17.749f, 8.09f, 17.749f, 9.16f)
                verticalLineTo(11.83f)
                curveTo(17.749f, 12.25f, 17.409f, 12.59f, 16.999f, 12.59f)
                close()
                moveTo(14.319f, 8.72f)
                curveTo(13.999f, 8.72f, 13.879f, 8.96f, 13.879f, 9.16f)
                verticalLineTo(10.65f)
                curveTo(13.879f, 10.85f, 13.989f, 11.09f, 14.319f, 11.09f)
                horizontalLineTo(16.249f)
                verticalLineTo(9.17f)
                curveTo(16.249f, 8.93f, 16.049f, 8.73f, 15.809f, 8.73f)
                horizontalLineTo(14.319f)
                verticalLineTo(8.72f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.91f, 16.78f)
                curveTo(14.65f, 16.78f, 14.4f, 16.65f, 14.26f, 16.41f)
                curveTo(14.05f, 16.05f, 14.17f, 15.59f, 14.52f, 15.38f)
                curveTo(15.88f, 14.57f, 16.25f, 14.36f, 16.25f, 11.84f)
                curveTo(16.25f, 11.43f, 16.59f, 11.09f, 17f, 11.09f)
                curveTo(17.41f, 11.09f, 17.75f, 11.43f, 17.75f, 11.84f)
                curveTo(17.75f, 14.92f, 17.08f, 15.61f, 15.29f, 16.67f)
                curveTo(15.17f, 16.74f, 15.04f, 16.78f, 14.91f, 16.78f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.86f, 12.59f)
                horizontalLineTo(8.18f)
                curveTo(7.09f, 12.59f, 6.24f, 11.74f, 6.24f, 10.65f)
                verticalLineTo(9.16f)
                curveTo(6.24f, 8.07f, 7.09f, 7.22f, 8.18f, 7.22f)
                horizontalLineTo(9.67f)
                curveTo(10.74f, 7.22f, 11.61f, 8.09f, 11.61f, 9.16f)
                verticalLineTo(11.83f)
                curveTo(11.61f, 12.25f, 11.28f, 12.59f, 10.86f, 12.59f)
                close()
                moveTo(8.19f, 8.72f)
                curveTo(7.87f, 8.72f, 7.75f, 8.96f, 7.75f, 9.16f)
                verticalLineTo(10.65f)
                curveTo(7.75f, 10.85f, 7.86f, 11.09f, 8.19f, 11.09f)
                horizontalLineTo(10.12f)
                verticalLineTo(9.17f)
                curveTo(10.12f, 8.93f, 9.92f, 8.73f, 9.68f, 8.73f)
                horizontalLineTo(8.19f)
                verticalLineTo(8.72f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.769f, 16.78f)
                curveTo(8.509f, 16.78f, 8.259f, 16.65f, 8.119f, 16.41f)
                curveTo(7.909f, 16.05f, 8.029f, 15.59f, 8.379f, 15.38f)
                curveTo(9.739f, 14.57f, 10.109f, 14.36f, 10.109f, 11.84f)
                curveTo(10.109f, 11.43f, 10.449f, 11.09f, 10.859f, 11.09f)
                curveTo(11.269f, 11.09f, 11.609f, 11.43f, 11.609f, 11.84f)
                curveTo(11.609f, 14.92f, 10.939f, 15.61f, 9.149f, 16.67f)
                curveTo(9.029f, 16.74f, 8.899f, 16.78f, 8.769f, 16.78f)
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

        return _QuoteUpCircle!!
    }

@Suppress("ObjectPropertyName")
private var _QuoteUpCircle: ImageVector? = null
