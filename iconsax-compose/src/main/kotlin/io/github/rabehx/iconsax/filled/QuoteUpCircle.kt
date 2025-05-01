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


val Iconsax.Filled.QuoteUpCircle: ImageVector
    get() {
        if (_QuoteUpCircle != null) {
            return _QuoteUpCircle!!
        }
        _QuoteUpCircle = ImageVector.Builder(
            name = "Filled.QuoteUpCircle",
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
                moveTo(11.61f, 11.84f)
                curveTo(11.61f, 14.92f, 10.94f, 15.61f, 9.15f, 16.67f)
                curveTo(9.03f, 16.74f, 8.9f, 16.77f, 8.77f, 16.77f)
                curveTo(8.51f, 16.77f, 8.26f, 16.64f, 8.12f, 16.4f)
                curveTo(7.91f, 16.04f, 8.03f, 15.58f, 8.38f, 15.37f)
                curveTo(9.59f, 14.65f, 10.01f, 14.39f, 10.09f, 12.58f)
                horizontalLineTo(8.19f)
                curveTo(7.1f, 12.58f, 6.25f, 11.73f, 6.25f, 10.64f)
                verticalLineTo(9.16f)
                curveTo(6.25f, 8.07f, 7.1f, 7.22f, 8.19f, 7.22f)
                horizontalLineTo(9.68f)
                curveTo(10.75f, 7.22f, 11.62f, 8.09f, 11.62f, 9.16f)
                verticalLineTo(11.84f)
                horizontalLineTo(11.61f)
                close()
                moveTo(17.75f, 11.84f)
                curveTo(17.75f, 14.92f, 17.08f, 15.61f, 15.29f, 16.67f)
                curveTo(15.17f, 16.74f, 15.04f, 16.77f, 14.91f, 16.77f)
                curveTo(14.65f, 16.77f, 14.4f, 16.64f, 14.26f, 16.4f)
                curveTo(14.05f, 16.04f, 14.17f, 15.58f, 14.52f, 15.37f)
                curveTo(15.73f, 14.65f, 16.15f, 14.39f, 16.23f, 12.58f)
                horizontalLineTo(14.32f)
                curveTo(13.23f, 12.58f, 12.38f, 11.73f, 12.38f, 10.64f)
                verticalLineTo(9.16f)
                curveTo(12.38f, 8.07f, 13.23f, 7.22f, 14.32f, 7.22f)
                horizontalLineTo(15.81f)
                curveTo(16.88f, 7.22f, 17.75f, 8.09f, 17.75f, 9.16f)
                verticalLineTo(11.84f)
                close()
            }
        }.build()

        return _QuoteUpCircle!!
    }

@Suppress("ObjectPropertyName")
private var _QuoteUpCircle: ImageVector? = null
