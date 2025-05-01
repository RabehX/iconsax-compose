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

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.QuoteDownCircle: ImageVector
    get() {
        if (_QuoteDownCircle != null) {
            return _QuoteDownCircle!!
        }
        _QuoteDownCircle = ImageVector.Builder(
            name = "Filled.QuoteDownCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                close()
                moveTo(11.61f, 14.84f)
                curveTo(11.61f, 15.93f, 10.76f, 16.78f, 9.67f, 16.78f)
                horizontalLineTo(8.19f)
                curveTo(7.12f, 16.78f, 6.25f, 15.91f, 6.25f, 14.84f)
                verticalLineTo(12.17f)
                curveTo(6.25f, 9.09f, 6.92f, 8.4f, 8.71f, 7.34f)
                curveTo(8.83f, 7.27f, 8.96f, 7.24f, 9.09f, 7.24f)
                curveTo(9.35f, 7.24f, 9.6f, 7.37f, 9.74f, 7.61f)
                curveTo(9.95f, 7.97f, 9.83f, 8.43f, 9.48f, 8.64f)
                curveTo(8.27f, 9.34f, 7.85f, 9.6f, 7.77f, 11.41f)
                horizontalLineTo(9.68f)
                curveTo(10.77f, 11.41f, 11.62f, 12.26f, 11.62f, 13.35f)
                verticalLineTo(14.84f)
                horizontalLineTo(11.61f)
                close()
                moveTo(17.75f, 14.84f)
                curveTo(17.75f, 15.93f, 16.9f, 16.78f, 15.81f, 16.78f)
                horizontalLineTo(14.32f)
                curveTo(13.25f, 16.78f, 12.38f, 15.91f, 12.38f, 14.84f)
                verticalLineTo(12.17f)
                curveTo(12.38f, 9.09f, 13.05f, 8.4f, 14.84f, 7.34f)
                curveTo(14.96f, 7.27f, 15.09f, 7.24f, 15.22f, 7.24f)
                curveTo(15.48f, 7.24f, 15.73f, 7.37f, 15.87f, 7.61f)
                curveTo(16.08f, 7.97f, 15.96f, 8.43f, 15.61f, 8.64f)
                curveTo(14.4f, 9.36f, 13.98f, 9.62f, 13.9f, 11.43f)
                horizontalLineTo(15.81f)
                curveTo(16.9f, 11.43f, 17.75f, 12.28f, 17.75f, 13.37f)
                verticalLineTo(14.84f)
                close()
            }
        }.build()

        return _QuoteDownCircle!!
    }

@Suppress("ObjectPropertyName")
private var _QuoteDownCircle: ImageVector? = null
